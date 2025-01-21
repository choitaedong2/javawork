package _02_wildcardGeneric;

public class Person {}
class Worker extends Person {}
class Student extends Person {public String toString() {return "Person";}}
class HighStudent extends Student {public String toString() {return "High";}}
class MiddleStudent extends Student {public String toString() {return "Middle";}}