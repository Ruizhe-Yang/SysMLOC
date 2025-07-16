package test{
    public import BooleanFunctions::*;

    attribute a : Boolean;
    attribute b : String;
    attribute c : String = ToString(a) + b;

}