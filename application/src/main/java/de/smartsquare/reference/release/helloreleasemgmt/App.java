package de.smartsquare.reference.release.helloreleasemgmt;

import de.smartsquare.reference.release.helloreleasemgmtstuff.Stuff;

public class App {

    public static void main(String[] args) {
        System.out.println("This is a small application, which fulfils only one purpose: Being the crashtest dummy for Smartsquare's reference\nimplementation of release management using Maven and Git.\n");

        System.out.println("To show how common development scenarios are being handled, it exists in several different versions reflecting states\nof a development lifecycle. The app you started is the artefact of the following scenario:\n");

        System.out.println(">>" + getAppScenario() + "<<\n");

        System.out.print("We also want to show how Maven's multi-module projects are handled, so we created a dependency to a module containing\nsome stuff. ");
        
        invokeStuff();
    }

    protected static String getAppScenario() {
        return "Merged another Hotfix, this time from 0.2.2.";
    }
    
    protected static void invokeStuff() {
        Stuff someStuff = new Stuff();
        System.out.println("The version of the currently used stuff is: " + someStuff.getVersion()+".");
    }
}
