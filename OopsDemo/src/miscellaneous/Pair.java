package miscellaneous;
//Generic class with 2 parameters-Maps-Key&value pairs-hashmap or  treemap



public class Pair<T, U> {
private T first;
private U second;
public Pair() {
	this.first=null;
	this.second=null;
	
}
public Pair(T first, U second) {
	super();
	this.first = first;
	this.second = second;
}
public T getFirst() {
	return first;
}
public void setFirst(T first) {
	this.first = first;
}
public U getSecond() {
	return second;
}
public void setSecond(U second) {
	this.second = second;
}

}
