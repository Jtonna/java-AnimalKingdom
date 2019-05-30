package animalkingdom;

public class Main
// every java app must have public 'Main' class. the classname (in this case Main), must relate back to the file name.
{
	public static void main(String[] args)
	// above is the public 'main' method. This is considered an entry point. It's also a child of the public class Main.
	// this has to be 'public' because java looks for the public main method signature. 
	// warning: if this is private the app will compile but not run as the main program's main entry point
	// "(String[] args)" is used when the method needs to pass an Array (yes, array) of string arguments to the application when we run it.
	{
		System.out.println("Hello There");
	}
}
