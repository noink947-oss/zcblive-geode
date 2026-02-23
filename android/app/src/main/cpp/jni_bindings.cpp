// JNI C++ Bindings for ZCBLive Geode
#include <jni.h>
#include <iostream>

extern "C" {
    JNIEXPORT void JNICALL Java_com_example_myapp_MyClass_myNativeMethod(JNIEnv* env, jobject obj) {
        std::cout << "Hello from C++!" << std::endl;
    }
}