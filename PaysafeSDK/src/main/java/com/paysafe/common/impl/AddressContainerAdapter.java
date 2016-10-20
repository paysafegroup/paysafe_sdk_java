/*
 * Copyright (c) 2014 Optimal Payments
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.paysafe.common.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.paysafe.common.AddressDetails;
import com.paysafe.common.Id;

import java.lang.reflect.Type;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * AddressContainerAdapter class used to properly serialize addressDetails node.
 */
public class AddressContainerAdapter implements
        JsonSerializer<AddressContainer>, JsonDeserializer<AddressContainer> {
  
  /** The gson serializer. */
  private final Gson gsonSerializer;
  
  /** The gson deserializer. */
  private final Gson gsonDeserializer;
  
  /**
   * Instantiates a new address container adapter.
   */
  public AddressContainerAdapter() {
    final GsonBuilder gsonSerializerBuilder = new GsonBuilder();
    gsonSerializerBuilder.excludeFieldsWithoutExposeAnnotation();
    gsonSerializerBuilder.registerTypeHierarchyAdapter(
            Id.class,
            new IdAdapter());
    gsonSerializerBuilder.registerTypeHierarchyAdapter(
            Boolean.class,
            new BooleanAdapter());
    gsonSerializer = gsonSerializerBuilder.create();
    
    final GsonBuilder gsonDeserializerBuilder = new GsonBuilder();
    gsonDeserializerBuilder.registerTypeHierarchyAdapter(
            Id.class,
            new IdAdapter());
    gsonDeserializer = gsonDeserializerBuilder.create();
  }

  /**
   * Serialize the object with all addressDetails properties within the base object.
   *
   * @param addressContainer the address container
   * @param typeOfSrc the type of src
   * @param context the context
   * @return the json element
   */
  @Override
  public JsonElement serialize(
          final AddressContainer addressContainer,
          final Type typeOfSrc,
          final JsonSerializationContext context) {

    
    final JsonElement base = gsonSerializer.toJsonTree(addressContainer);
    if (base.isJsonObject()) {
      final JsonObject baseObj = base.getAsJsonObject();
      if (baseObj.has("addressDetails")) {
        final JsonElement details = baseObj.get("addressDetails");
        baseObj.remove("addressDetails");
        for (Map.Entry<String, JsonElement> entry : details.getAsJsonObject().entrySet()) {
          baseObj.add(entry.getKey(), entry.getValue());
        }
      }
    }
    return base;
  }

  /**
   * Deserialize with all properties correctly set within the addressDetails node.
   *
   * @param json the json
   * @param typeOfT the type of t
   * @param context the context
   * @return the address container
   */
  @Override
  public AddressContainer deserialize(
          JsonElement json,
          Type typeOfT,
          JsonDeserializationContext context) {
    AddressDetails addressDetails = gsonDeserializer.fromJson(json, AddressDetails.class);
    AddressContainer address = gsonDeserializer.fromJson(json, typeOfT);

    address.setAddressDetails(addressDetails);

    return address;
  }
}
