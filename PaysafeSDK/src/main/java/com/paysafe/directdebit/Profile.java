/*
 * Copyright (c) 2016 Paysafe
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
package com.paysafe.directdebit;

import com.google.gson.annotations.Expose;
import com.paysafe.common.DateOfBirth;
import com.paysafe.common.impl.DomainObject;
import com.paysafe.common.impl.GenericBuilder;
import com.paysafe.common.impl.NestedBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Profile.
 * @author manisha.rani
 * @since 03-03-2016.
 */

public class Profile implements DomainObject {
    
    /** The first name. */
    @Expose
    private String firstName;
    
    /** The last name. */
    @Expose
    private String lastName;
    
    /** The email. */
    @Expose
    private String email;
    
    /** The ssn. */
    @Expose
    private String ssn;
    
    /** The date of birth. */
    @Expose
    private DateOfBirth dateOfBirth;

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Gets the ssn.
     *
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the ssn.
     *
     * @param ssn the new ssn
     */
    public void setSsn(final String ssn) {
        this.ssn = ssn;
    }

    /**
     * Gets the date of birth.
     *
     * @return the date of birth
     */
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth.
     *
     * @param dateOfBirth the new date of birth
     */
    public void setDateOfBirth(final DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * The sub-builder class for Profile.
     *
     * @param <BLDRT> the parent builder
     */
    public static class ProfileBuilder<BLDRT extends GenericBuilder> extends
            NestedBuilder<Profile, BLDRT> {

        /** The Profile. */
        private final Profile Profile = new Profile();
        
        /** The date of birth builder. */
        private DateOfBirth.DateOfBirthBuilder<ProfileBuilder<BLDRT>> dateOfBirthBuilder;

        /**
         * Instantiates a new profile builder.
         *
         * @param parent the parent
         */
        public ProfileBuilder(final BLDRT parent) {
            super(parent);
        }

        /**
         * Build this Profile object.
         *
         * @return Profile
         */
        @Override
        public final Profile build() {
            if (null != dateOfBirthBuilder) {
                Profile.setDateOfBirth(dateOfBirthBuilder.build());
            }
            return Profile;
        }

        /**
         * Set the firstName property.
         *
         * @param firstName the first name
         * @return ProfileBuilder< BLDRT >
         */
        public final ProfileBuilder<BLDRT> firstName(final String firstName) {
            Profile.setFirstName(firstName);
            return this;
        }

        /**
         * Set the lastName property.
         *
         * @param lastName the last name
         * @return ProfileBuilder< BLDRT >
         */
        public final ProfileBuilder<BLDRT> lastName(final String lastName) {
            Profile.setLastName(lastName);
            return this;
        }
        
        /**
         * Set the email property.
         *
         * @param email the email
         * @return ProfileBuilder< BLDRT >
         */
        public final ProfileBuilder<BLDRT> email(final String email) {
            Profile.setEmail(email);
            return this;
        }

        /**
         * Set the ssn property.
         *
         * @param ssn the ssn
         * @return ProfileBuilder< BLDRT >
         */
        public final ProfileBuilder<BLDRT> ssn(final String ssn) {
            Profile.setSsn(ssn);
            return this;
        }

      
    }

}
