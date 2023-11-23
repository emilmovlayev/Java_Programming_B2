package day38_interface.shopping;

public interface ConsumerApp extends AllowUserToSell, Shipping {

}


// Here we are implementing two interface to a class: AllowUserToSell, Shipping
abstract class TestA implements AllowUserToSell, Shipping {

}

// Here I am implementing ConsumerApp interface which also inherits from interfaces called: AllowUserToSell, Shipping
abstract class TestB implements ConsumerApp {

}
// interface can "extends" multiple interface
// class can "extends" ONE class
// class can "implements" multiple interfaces