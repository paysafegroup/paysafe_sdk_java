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

import java.lang.reflect.Type;

// TODO: Auto-generated Javadoc
/**
 * This class is attempts to correct data inconsistencies between api requests and responses.
 */
public class BooleanAdapter implements JsonDeserializer<Boolean> {

  /**
   * Some api transactions will return 0 or 1 instead of the expected true or false.
   *
   * @param el the el
   * @param typeOfT the type of t
   * @param context the context
   * @return Boolean
   * @throws JsonParseException the json parse exception
   */
  @Override
  public Boolean deserialize(JsonElement el, Type typeOfT, JsonDeserializationContext context)
          throws JsonParseException {
    if (((Class<?>) typeOfT).equals(Boolean.class)) {
      return el.getAsBoolean();
    } else if (((Class<?>) typeOfT).isInstance(Integer.class)) {
      final int elAsInt = el.getAsInt();
      if (elAsInt < 0 || elAsInt > 1) {
        throw new JsonParseException("Boolean out of range: " + elAsInt);
      }
      return elAsInt == 1;
    } else {
      throw new JsonParseException("Unexpected type: " + typeOfT);
    }
  }
}
