
/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

/* THIS FILE IS AUTO-GENERATED FROM soot_options.xml. DO NOT MODIFY. */

package soot.options;
import java.util.*;

/** Option parser for Array Bound Check Options. */
public class ABCOptions
{
    private Map options;

    public ABCOptions( Map options ) {
        this.options = options;
    }
    
    /** Disabled --  */
    public boolean disabled() {
        return soot.PackManager.getBoolean( options, "disabled" );
    }
    
    /** With All --  */
    public boolean withAll() {
        return soot.PackManager.getBoolean( options, "with-all" );
    }
    
    /** With Field References --  */
    public boolean withFieldRef() {
        return soot.PackManager.getBoolean( options, "with-fieldref" );
    }
    
    /** With Array References --  */
    public boolean withArrayRef() {
        return soot.PackManager.getBoolean( options, "with-arrayref" );
    }
    
    /** With Common Sub-expressions --  */
    public boolean withCse() {
        return soot.PackManager.getBoolean( options, "with-cse" );
    }
    
    /** With Class Field --  */
    public boolean withClassField() {
        return soot.PackManager.getBoolean( options, "with-classfield" );
    }
    
    /** With Rectangular Array --  */
    public boolean withRectArray() {
        return soot.PackManager.getBoolean( options, "with-rectarray" );
    }
    
    /** Profiling --  */
    public boolean profiling() {
        return soot.PackManager.getBoolean( options, "profiling" );
    }
    
}
        
