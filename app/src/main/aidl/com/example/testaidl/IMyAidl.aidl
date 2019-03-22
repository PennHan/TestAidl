// IMyAidl.aidl
package com.example.testaidl;

import com.example.testaidl.bean.Person;

// Declare any non-default types here with import statements

interface IMyAidl {
    void addPerson(in Person person);

    List<Person> getPersonList();
}
