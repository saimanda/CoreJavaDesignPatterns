Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern

   Early Instantiation: creation of instance at load time.
   Lazy Instantiation: creation of instance when required.

# Advantage of Singleton design pattern
Saves memory because object is not created at each request. Only single instance is reused again and again.

# Usage of Singleton design pattern
Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

# If singleton class is loaded by two classloaders, two instance of singleton class will be created, one for each classloader.

# Significance of Serialization in Singleton Pattern

If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized, you can deserialize it but it will not return the singleton object.

To resolve this issue, you need to override the readResolve() method that enforces the singleton. It is called just after the object is deserialized. It returns the singleton object.

public class A implements Serializable {
        //your code of singleton
        protected Object readResolve() {
            return getA();
        }

    }
