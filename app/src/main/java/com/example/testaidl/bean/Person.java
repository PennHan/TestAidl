package com.example.testaidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/11.
 */
public class Person implements Parcelable {

    private String mName;

    public Person(String name) {
        this.mName = name;
    }

    protected Person(Parcel in) {
        this.mName = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
