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

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.paysafe.common.Id;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// TODO: Auto-generated Javadoc
/**
 * Type adapter for converting an Id to its serialized form.
 */
public class IdAdapter implements JsonSerializer<Id<? extends BaseDomainObject>>,
        JsonDeserializer<Id<? extends BaseDomainObject>> {
  
  /**
   * Serialize.
   *
   * @param src the src
   * @param typeOfSrc the type of src
   * @param context the context
   * @return the json element
   */
  @Override
  public final JsonElement serialize(Id<?> src, Type typeOfSrc, JsonSerializationContext context) {
    return new JsonPrimitive(src.toString());
  }

  /* (non-Javadoc)
   * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
   */
  @Override
  public final Id<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {
    if (!(typeOfT instanceof ParameterizedType)) {
      throw new JsonParseException("Unexpected type: " + typeOfT);
    }
    final ParameterizedType parameterizedType = (ParameterizedType) typeOfT;

    final Type typeOfId = parameterizedType.getActualTypeArguments()[0];

    @SuppressWarnings("unchecked")
    final Class<BaseDomainObject> clazz = (Class<BaseDomainObject>) typeOfId;
    return Id.create(json.getAsString(), clazz);
  }
}
