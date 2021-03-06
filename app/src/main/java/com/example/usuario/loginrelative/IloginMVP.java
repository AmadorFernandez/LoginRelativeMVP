package com.example.usuario.loginrelative;

import android.content.Intent;

/**
 * Created by Amador Fernández González on 6/10/16.
 *
 * Interface for implementations of MVP
 */
public interface IloginMVP {

    int OK = 0;
    int PASSWORD_DIGIT = 1;
    int PASSWORD_CASE = 2;
    int PASSWORD_LENGTH = 3;
    int PASSWORD_DATA_EMTY = 4;




    /**
     * This interface have to implements for the View
     * */
    interface View{

        //For the message of error
         void setMessageError(String error);

    }

    /**
     * This interface have to implements for the presenter
     *
     * */
    interface Presenter{

        //For validate the user and the password.
        void validateCredentials(String pass, String user);

    }
}
