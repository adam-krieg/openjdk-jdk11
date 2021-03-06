/*
 * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package pkg4;

public class C {

    /**
     * Defines the number of cycles in this animation. The {@code cycleCount}
     * may be {@code INDEFINITE} for animations that repeat indefinitely.
     * Now we add a > to deliberately cause an Html error.
     * @defaultValue 11
     * @since JavaFX 8.0
     */
    public DoubleProperty rate;

    public final void setRate(double value) {}

    public final double getRate() {return 2.0d;}

    public final DoubleProperty rateProperty() {return new DoubleProperty();}

    class DoubleProperty {}

}
