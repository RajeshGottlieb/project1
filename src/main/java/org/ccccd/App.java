package org.ccccd;

import org.apache.log4j.Logger;

public class App 
{
    static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("Hello World");
    }
}
