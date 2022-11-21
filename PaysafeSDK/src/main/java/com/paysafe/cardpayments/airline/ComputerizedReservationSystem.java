/*
 * Copyright (c) 2021 Optimal Payments
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
package com.paysafe.cardpayments.airline;

/**
 * Indicates the computerized reservation system used to make
 * the reservation and purchase the ticket.
 * <p>For tickets purchased in Germany, this field should one of these codes:</p>
 * <ul>
 *   <li>STRT = Start</li>
 *   <li>PARS = TWA</li>
 *   <li>DATS = Delta</li>
 *   <li>SABR = Sabre</li>
 *   <li>DALA = Covia-Apollo</li>
 *   <li>BLAN = Dr. Blank</li>
 *   <li>DERD = DER</li>
 *   <li>TUID = TUI</li>
 * </ul>
 */
public enum ComputerizedReservationSystem {
  STRT,
  PARS,
  DATS,
  SABR,
  DALA,
  BLAN,
  DERD,
  TUID
}
