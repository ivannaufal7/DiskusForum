/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.regex.Pattern;

/**
 *
 * @author maqielhm
 */
public class Constant {

    public static final String host = "localhost";
    public static final int port = 3306;
    public static final String db = "db_diskus_forum";
    public static final String user = "root";
    public static final String password = "";
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public static final String DEFAULT_SUBHOME_SEARCH_TEXT = "Want To Know Something . . .";
    public static final String DEFAULT_SUBCOMMUNITY_SEARCH_TEXT = "Find The Community . . .";
    public static final String DEFAULT_SUBMYTHREAD_SEARCH_TEXT = "Want To Know Something . . .";
    public static final String DEFAULT_SUBHOME_COMMENT_TEXT = "Enter your comment here . . .";

    public static String USER_ID  = "";
    
}
