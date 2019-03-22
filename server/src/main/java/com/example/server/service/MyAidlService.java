package com.example.server.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.example.testaidl.IMyAidl;
import com.example.testaidl.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * dec:
 *
 * @author hanpeidong on 2019/3/11.
 */
public class MyAidlService extends Service {
    private final String TAG = this.getClass().getSimpleName();

    private ArrayList<Person> mPersons;

    private IBinder mBinder = new IMyAidl.Stub() {
        @Override
        public void addPerson(Person person) throws RemoteException {
            mPersons.add(person);
        }

        @Override
        public List<Person> getPersonList() throws RemoteException {
            return mPersons;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        mPersons = new ArrayList<>();
        Log.d(TAG, "MyAidlService onBind");
        return mBinder;
    }


}
