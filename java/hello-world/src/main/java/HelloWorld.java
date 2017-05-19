public class HelloWorld {
    public static String hello(String name) {
    	if (name == null) {
    		name = "World";
        return "Hello, " + name + "!";
    }
    else if (name == "") {
    	name = "World";
    	return "Hello, " + name + "!";
    }
    else if (name.length() == 0){
    	name = "World";
    	return "Hello, " + name + "!";
    }
    else
    {
    	return "Hello, " + name + "!";
    }
    }
}
