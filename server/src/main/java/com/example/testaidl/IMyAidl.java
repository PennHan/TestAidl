/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: F:\\AndroidStudioSpace\\Github\\TestAidl\\app\\src\\main\\aidl\\com\\example\\testaidl\\IMyAidl.aidl
 */
package com.example.testaidl;
// Declare any non-default types here with import statements

public interface IMyAidl extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.example.testaidl.IMyAidl {
        private static final String DESCRIPTOR = "com.example.testaidl.IMyAidl";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.example.testaidl.IMyAidl interface,
         * generating a proxy if needed.
         */
        public static com.example.testaidl.IMyAidl asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.example.testaidl.IMyAidl))) {
                return ((com.example.testaidl.IMyAidl) iin);
            }
            return new com.example.testaidl.IMyAidl.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            String descriptor = DESCRIPTOR;
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(descriptor);
                    return true;
                }
                case TRANSACTION_addPerson: {
                    data.enforceInterface(descriptor);
                    com.example.testaidl.bean.Person _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = com.example.testaidl.bean.Person.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.addPerson(_arg0);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_getPersonList: {
                    data.enforceInterface(descriptor);
                    java.util.List<com.example.testaidl.bean.Person> _result = this.getPersonList();
                    reply.writeNoException();
                    reply.writeTypedList(_result);
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        private static class Proxy implements com.example.testaidl.IMyAidl {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public void addPerson(com.example.testaidl.bean.Person person) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((person != null)) {
                        _data.writeInt(1);
                        person.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_addPerson, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public java.util.List<com.example.testaidl.bean.Person> getPersonList() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.util.List<com.example.testaidl.bean.Person> _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPersonList, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.createTypedArrayList(com.example.testaidl.bean.Person.CREATOR);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_addPerson = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_getPersonList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public void addPerson(com.example.testaidl.bean.Person person) throws android.os.RemoteException;

    public java.util.List<com.example.testaidl.bean.Person> getPersonList() throws android.os.RemoteException;
}
