import java.util.Scanner;
public class StringNumberArrayWorkshop{
	
//Constant definition and declaration

//Constants for exercises 1-5 
private final static int FIRST_PROBLEMS=1; 
private final static int PRINT_STRINGS=1;
private final static int CONCATENATE_STRINGS=2;
private final static int PRINT_CHARACTER=3;
private final static int EXIT_STRINGS=4;


private final static int STRING_ARRAY_SIZE=3; 

//Constants for exercises 6-8
private final static int SECOND_PROBLEMS=2;
private final static int ONE_DIVIDED_BY_TWO=1;
private final static int TWO_DIVIDED_BY_ONE=2;
private final static int WHOLE_ONE_DIVIDED_BY_TWO=3;
private final static int WHOLE_TWO_DIVIDED_BY_ONE=4;
private final static int EXIT_DIV=5;



//Constants for exercises 9-18
private final static int THIRD_PROBLEMS=3; 
private final static int FIRST_ARRAY=1;
private final static int SECOND_ARRAY=2;
private final static int THIRD_ARRAY=3;
private final static int ARRAY_QUANTITY=3;

private final static int PRINT_ARRAYS=1;
private final static int ARRAY_AVERAGE=2;
private final static int ARRAY_MAX=3;
private final static int ARRAY_ADD=4;
private final static int ARRAY_SUBRACT=5;
private final static int ARRAY_MULTIPLY=6;
private final static int UNITE_ARRAYS=7;
private final static int UNITE_ARRAYS_NO_REPEAT=8;
private final static int INTERCEPT_ARRAYS=9;
private final static int SPIN_ARRAYS=10;
private final static int ORDER_ARRAYS=11;
private final static int EXIT_ARRAYS=12;










//Constant for exiting the program
private final static int EXIT=4; 


// Variable declaration 

// General variables
static Scanner sc;
static Scanner sc1;
static int menu;
static int submenu1;
static int submenu2;
static int submenu3;

// for exercises 1-5 
static String[] strings;
static int[] stringsLengths;
static String concatenateStrings;
static int string;
static int posChar;

// for exercises 6-8 
static double number1;
static double number2;
static double division1;
static double division2;
static int wholeNum1;
static int wholeNum2;
static int wholeDiv1;
static int wholeDiv2;
static int wholeRemainder1;
static int wholeRemainder2;

// for exercises 9-18
static int arraySize1;
static int arraySize2;
static int arraySize3;

static int[] firstArray;
static int[] secondArray;
static int[] thirdArray;

static String displayArray1;
static String displayArray2;
static String displayArray3;

static int arraySelector;

static double arrayAverage;

static int maxVal;
static int maxValfinal;

static int[] addedArray;
static int[] subtractedArray;
static int[] multipliedArray;


static int[] unrepeatedUnion;
static int unrepeatedCounter;
static int differentCounter;
static int occupiedPos;

static int[] interceptedArray;
static int[] interceptedArray2;
static int repeatedCounter;
static int repeatedCounter2;
static int differentCounter2;
static int occupiedPos2;
static int occupiedPos3;

static int[] spinnedArray;
static int spinNumber;
static int finalPos;

/** Method that initializes variables previously declared <br>
	<b> pre: </b> The variables have been declared<br>
	<b> post: </b> Initializes variables <br>

		*/
	public static void initialize() {
		
		sc = new Scanner(System.in);
		sc1= new Scanner(System.in);
		
		// exercises 1-5
		
		strings = new String[STRING_ARRAY_SIZE];
		stringsLengths = new int[STRING_ARRAY_SIZE];
		concatenateStrings=" ";
		posChar=0;
		
		// exercises 9-18
		
		displayArray1=" ";
		displayArray2=" ";
		displayArray3=" ";
		arrayAverage=0;

		unrepeatedCounter=0;
		differentCounter=0; 
		occupiedPos=0;
		
		
		repeatedCounter=0;
		repeatedCounter2=0;
		differentCounter2=0; 
		occupiedPos2=0;
		occupiedPos3=0;
		
		spinNumber=0;
		finalPos=0;
		}

/** Method that asks for three strings and stores them and their sizes in seperate arrays (exercise 2)<br>
	<b> pre: </b> The arrays are initialized and size three<br>
	<b> post: </b> Fills two arrays, one with the strings and the others with their length<br>
		*/
	public static void askStrings(){
		
	System.out.println("Ingrese tres cadenas");	
	
	for(int i=0; i< STRING_ARRAY_SIZE; i++){
		strings[i]=sc1.nextLine();
		stringsLengths[i]=strings[i].length(); 
		}
		
	}
	
	/** Method that prints the strings entered and their lengths  (exercise 3)<br>
	<b> pre: </b> The arrays are filled<br>
	<b> post: </b> Prints the strings that were entered and their lengths<br>
		*/
	public static void printStrings(){
		
	for(int i=0; i< STRING_ARRAY_SIZE; i++){
		System.out.println("La cadena "+strings[i]+" tiene longitud "+stringsLengths[i]+" \n");
		}
	}
	
	/** Method that concatenates the strings entered  (exercise 4)<br>
	<b> pre: </b> The arrays are filled<br>
	<b> post: </b> Concatenates the strings entered and prints them<br>
		*/
	public static void concatenateStrings(){
	concatenateStrings= strings[0] +" "+ strings[1] +" "+ strings[2];
	System.out.println("Las cadenas concatenadas dicen " +concatenateStrings+" \n" );
	}
	
	/** Method that prints a selected character from a string selected by the user  (exercise 5)<br>
	<b> pre: </b> The arrays are filled<br>
	<b> post: </b> Prints the character selected by the user from the string selected by the user<br>
		*/
	public static void printChar(){
		
	do{

	System.out.println("Ingrese el un numero para seleccionar la cadena \n 1) "+strings[0]+ "\n 2) "+ strings[1] + "\n 3) "+strings[2]);
	string=sc.nextInt();

	if(string>STRING_ARRAY_SIZE){
	System.out.println("La cadena "+ string + " no existe \nIngrese una opcion valida"+" \n");
	}
					}
	while(string>STRING_ARRAY_SIZE);

	do{

	System.out.println("Ingrese la posicion que representa el caracter de la cadena "+ strings[string-1]+ " que desea ver");
	posChar=sc.nextInt();

	if(posChar>strings[string-1].length() || posChar<=0){
	System.out.println("La posicion" + posChar + " de la cadena "+ strings[string-1]+" no existe \nIngrese un caracter valido"+" \n");
	}
	}
	while(posChar>strings[string-1].length() || posChar<=0);

	System.out.println("El caracter en la posicion " + posChar + " de la cadena "+ strings[string-1] + " es: "+strings[string-1].charAt(posChar-1)+" \n");
	
	}
	
	/** Method for a sub menu for the first five excersises<br>
	<b> pre: </b> <br>
	<b> post: </b> Does the action selected by the user<br>
		*/
	public static void firstProblems(){
		//The user is asked to enter strings
		
		askStrings();
		
		// The user is asked what he or she wants to do
		
		do{
		System.out.println("Ingrese el numero que representa la tarea que desea realizar \n 1) Imprimir la longitud de las cadenas \n 2) Concatenar las cadenas \n 3) Ver un caracter de la cadena \n 4) Salir");
		submenu1=sc.nextInt();
		sc.nextLine();

		switch(submenu1){

		case PRINT_STRINGS: 
		printStrings();
		
		break;

		case CONCATENATE_STRINGS: 
		concatenateStrings();

		break;

		case PRINT_CHARACTER: 
		printChar();
		
		break;

		}
		if(submenu1>EXIT_STRINGS){
		System.out.println("Elija una opcion valida");
		}
		}while(submenu1 != EXIT_STRINGS);
		initialize();
		System.out.println("Se salio con exito");
		}
		
	/** Method that asks for two numbers (exercise 6)<br>
		
		<b> post: </b> Saves the two numbers entered <br>
		
		*/
	public static void askNumbers(){
		System.out.println("Ingrese dos numeros reales no negativos");
		number1=sc.nextDouble();
		sc.nextLine();
		number2=sc.nextDouble();
		sc.nextLine();
			
		}
		
	/**	Method that divides two numbers(excersises 7-8)<br>
		<b> pre: </b> Both numbers that are entered must be positive real numbers <br>
		<b> post: </b> Prints the division of both numbers,the division of the whole part of both numbers and their remainds <br>		
		@param n1, first number, positve real 
		@param n2, second number, positive real
		*/
	public static void Division(double n1, double n2){
		
		wholeNum1= (int) n1;
		wholeNum2= (int) n2;	
		
		// The user is asked what he or she wants to do
		
		do{
			
		System.out.println("Ingrese el numero que representa la tarea que desea realizar \n 1) Dividir el primero por el segundo" 
		+ " \n 2) Dividir el segundo por el primero \n 3) Dividir las partes enteras del primero por el segundo (con residuo)"
		+" \n 4) Dividir las partes enteras del segundo por el el primero (con residuo) \n 5) Salir ");
		
		submenu2=sc.nextInt();
		sc.nextLine();

		switch(submenu2){

		case ONE_DIVIDED_BY_TWO: 
		division1= n1/n2;
		System.out.println("\nEl cociente entre "+n1+ " y "+n2+ " es: " + division1+ "\n" );
		
		break;

		case TWO_DIVIDED_BY_ONE: 
		division2=n2/n1;
		System.out.println("El cociente entre "+n2+ " y "+n1+ " es: " + division2 +" \n");

		break;

		case WHOLE_ONE_DIVIDED_BY_TWO: 
		wholeDiv1= wholeNum1/wholeNum2;
		wholeRemainder1= wholeNum1%wholeNum2;
			
		System.out.println("El cociente entre las partes enteras "+ wholeNum1+ " y "+wholeNum2+ " es: " + wholeDiv1 );
		System.out.println("El residuo de las partes enteras "+ wholeNum1+ " y "+wholeNum2 +" es: " + wholeRemainder1+" \n");
		
		break;
		
		case WHOLE_TWO_DIVIDED_BY_ONE:
		
		wholeDiv2= wholeNum2/wholeNum1;
		wholeRemainder2= wholeNum2%wholeNum1;
			
		System.out.println("El cociente entre las partes enteras "+ wholeNum2+ " y "+wholeNum1 +" es: " + wholeDiv2);
		System.out.println("El residuo de las partes enteras "+ wholeNum2+ " y "+wholeNum1+ " es: " + wholeRemainder2+" \n");
		
		break;
		

		}
		
		if(submenu2>EXIT_DIV){
		System.out.println("Elija una opcion valida");
		}
		
		}while(submenu2 != EXIT_DIV);
		initialize();
		System.out.println("Se salio con exito");
		}
			
			
	/** Method that creates and fills three arrays (exercise 9)<br>
		
		<b> pre: </b> <br>
		<b> post: </b> Three arrays of desired sizes are created and filled with chosen whole numbers<br>
		
		*/
	public static void createArrays(){
	System.out.println("Ingrese el tamano que desea para el primer arreglo");
	arraySize1=sc.nextInt();
	sc.nextLine();
	firstArray=new int[arraySize1];
		
	for(int i=0; i<arraySize1;i++){
	System.out.println("Ingrese el numero que va en la posicion "+ (i+1)+")");
	firstArray[i]= sc.nextInt();
	sc.nextLine();
	}
		
	System.out.println("Ingrese el tamano que desea para el segundo arreglo");
	arraySize2=sc.nextInt();
	sc.nextLine();
	secondArray=new int[arraySize2];
		
	for(int i=0; i<arraySize2;i++){
	System.out.println("Ingrese el numero que va en la posicion "+ (i+1)+")");
	secondArray[i]= sc.nextInt();
	sc.nextLine();
	}
		
	System.out.println("Ingrese el tamano que desea para el tercer arreglo");
	arraySize3=sc.nextInt();
	sc.nextLine();
	thirdArray=new int[arraySize3];
		
	for(int i=0; i<arraySize3;i++){
	System.out.println("Ingrese el numero que va en la posicion "+ (i+1)+")");
	thirdArray[i]= sc.nextInt();
	sc.nextLine();
	}
		
	}	
			
	/** Method for printing arrays (excersise 10)<br>
		
		<b> pre: </b> The arrays must have been created<br>
		<b> post: </b> The arrays are printed<br>
		
		*/
	public static void printArrays(){
		
	for(int i=0; i<arraySize1;i++){
		
	if(i==arraySize1-1){
	displayArray1 += firstArray[i];
	}else{
	displayArray1 += firstArray[i]+",";
	}
		
	}
		
	System.out.println("El primer arreglo se compone de: " +displayArray1);
		
	for(int i=0; i<arraySize2;i++){
		
	if(i==arraySize2-1){
	displayArray2 += secondArray[i];
	}else{
	displayArray2 += secondArray[i]+",";
	}
		
	}
		
	System.out.println("El segundo arreglo se compone de: " +displayArray2);
		
	for(int i=0; i<arraySize3;i++){
		
	if(i==arraySize3-1){
	displayArray3 += thirdArray[i];
	}else{
	displayArray3 += thirdArray[i]+",";
	}
	
	}
		
	System.out.println("El tercer arreglo se compone de: " +displayArray3+"\n");
		
	}			
			
	/** Method for printing a single array <br>
		
	<b> pre: </b> The entered array must be filled with whole numbers<br>
	<b> post: </b> The array is printed<br>
		
	@param array1 , must be filled with whole numbers and !=null
		
	*/
	public static String printSingleArray(int[] array1){
		
	String displayArray= "";
	for(int i=0; i<array1.length;i++){
		
	if(i==array1.length-1){
	displayArray+= array1[i];
	}else{
	displayArray+= array1[i]+",";
	}
		
	}
	return displayArray;

	}		
			
	/** Method for selecting an array <br>
		
	<b> pre: </b> The arrays must have been created and filled with whole numbers<br>
	<b> post: </b> Returns the selected array by the user<br>
	@return an array of whole numbers selected by the user;
		
	*/
	public static int[] selectArray(){
	do{

	System.out.println("Ingrese el arreglo que desea utilizar \n 1) Primer Arreglo: "+ printSingleArray(firstArray)+
	" \n 2) Segundo Arreglo: "+ printSingleArray(secondArray)+" \n 3) Tercer Arreglo: "+ printSingleArray(thirdArray));
	arraySelector=sc.nextInt();
	sc.nextLine();

	if(arraySelector>ARRAY_QUANTITY){
	System.out.println("La opcion seleccionada no existe \nIngrese una opcion valida");
	}
	}
	while(arraySelector>ARRAY_QUANTITY);
					
	if(arraySelector==FIRST_ARRAY){
	return firstArray;
	}else if( arraySelector==SECOND_ARRAY){
	return secondArray;
	}else{
	return thirdArray;
	}
								
	}
	
	/** Method for calculating the average of the elements in an array (exercise 11) <br>
		
	<b> pre: </b> The entered array must be filled with whole numbers<br>
	<b> post: </b> The average of the whole numbers in the array is printed<br>
	@param array, array selected by the user, must be filled with whole numbers and !=null
		
	*/
	public static void averageArrays(int[] array){
	for(int i=0; i<array.length; i++){
	arrayAverage+=array[i];
	}
			
	arrayAverage/=array.length;
		
	System.out.println("El promedio del arreglo seleccionado es: "+arrayAverage);
			
	}
	
	/** Method for finding the maximum value in an array(exercise 12) <br>
		
		
	<b> pre: </b> The entered array must be filled with whole numbers<br>
	<b> post: </b> The maximum value of the array is printed<br>
	@param array, array selected by the user, must be filled with whole numbers and !=null 
		
	*/
	public static void maxArrays(int[] array){
	for(int i=0; i<array.length; i++){
		for(int j=0; j<array.length; j++){
			if(array[i]>array[j]){
			maxVal=array[i];
			}
			}
		}
		System.out.println("El mayor valor del arreglo seleccionado es: "+maxVal);
		}
		
	/** Method for adding two arrays(exercise 13) <br>
		
	<b> pre: </b> The entered arrays must be filled with whole numbers and must be the same size<br>
	<b> post: </b> The arrays are added and stored in an array or it says the cant be added<br>
	@param array1, array selected by the user, must be filled with whole numbers and !=null 
	@param array2, array selected by the user, must be filled with whole numbers and !=null 
		
	*/
	public static void addArrays(int[] array1, int[] array2){
	if(array1.length == array2.length){
	addedArray= new int[array1.length];
	
	for(int i=0; i< array1.length;i++){
	addedArray[i]=array1[i]+array2[i];
	}
	System.out.println("La suma de los arreglos da el nuevo arreglo que se compone de:" +printSingleArray(addedArray));
	}else{
	System.out.println("No se pueden sumar los arreglos ya que tienen tamannos diferentes");
	}
		
	}	
		
	/** Method for subtracting two arrays(exercise 13) <br>
		
	<b> pre: </b> The entered arrays must be filled with whole numbers and must be the same size<br>
	<b> post: </b> The arrays are subtracted and stored in an array or it says the cant be subtracted <br>
	@param array1, array selected by the user, must be filled with whole numbers and !=null 
	@param array2, array selected by the user, must be filled with whole numbers and !=null 
		
	*/
	public static void subtractArrays(int[] array1, int[] array2){
			
	if(array1.length == array2.length){
	subtractedArray= new int[array1.length];
		
	for(int i=0; i< array1.length;i++){
	subtractedArray[i]=array1[i]-array2[i];
	}
	System.out.println("La resta de los arreglos da el nuevo arreglo que se compone de:" +printSingleArray(subtractedArray));
	}else{
	System.out.println("No se pueden restar los arreglos ya que tienen tamanos diferentes");
	}
	}
	
	/** Method for multiplying two arrays(exercise 13) <br>
		
	<b> pre: </b> The entered arrays must be filled with whole numbers and must be the same size<br>
	<b> post: </b> The arrays are multiplied and stored in an array or it says the cant be multiplied <br>
	@param array1, array selected by the user, must be filled with whole numbers and !=null 
	@param array2, array selected by the user, must be filled with whole numbers and !=null 
		
	*/
	
	public static void multiplyArrays(int[] array1, int[] array2){
			
	if(array1.length == array2.length){
	multipliedArray= new int[array1.length];
		
	for(int i=0; i< array1.length;i++){
	multipliedArray[i]=array1[i]*array2[i];
	
	}
	System.out.println("La multiplicacion de los arreglos da el nuevo arreglo que se compone de:" +printSingleArray(multipliedArray));
	}else{
	System.out.println("No se pueden multiplicar los arreglos ya que tienen tamanos diferentes");
	}
		
	}
	
	/** Method for uniting arrays with repetition(exercise 14) <br>
		
		<b> pre: </b> The entered arrays must be filled with whole numbers <br>
		<b> post: </b> A new array is created with all the elements including repeated ones<br>
		@param array1, first array entered by the user, must be filled with whole numbers and !=null 
		@param array2, second array entered by the user, must be filled with whole numbers and !=null 
		@param array3, third array entered by the user, must be filled with whole numbers and !=null 
		*/
		public static int[] uniteArraysRepetition(int[] array1, int[] array2, int[] array3){
		int[] repeatedUnion=new int[array1.length+array2.length+array3.length];
		
		for(int i=0; i<array1.length; i++){
		repeatedUnion[i]=array1[i];
		}
		
		for(int i=0;i<array2.length;i++){
		repeatedUnion[array1.length+i]=array2[i];
		}
		
		for(int i=0;i<array3.length;i++){
		repeatedUnion[array1.length+array2.length+i]=array3[i];
		}
		
		
		return repeatedUnion;
		
		
		}
	
	/** Method for uniting arrays without repetition(exercise 15) <br>
		
		<b> pre: </b>The entered arrays must be filled with whole numbers <br>
		<b> post: </b> A new array is created with all the elements not including repeated ones<br>
		@param array1, first array entered by the user, must be filled with whole numbers and !=null 
		@param array2, second array entered by the user, must be filled with whole numbers and !=null 
		@param array3, third array entered by the user, must be filled with whole numbers and !=null 
		*/
		public static void uniteArraysNoRepetition(int[] array1, int[] array2, int[] array3){
            
        //We create a new array with all elements so we can delete the repeated ones
            
		int[] unrepeatedArray1= uniteArraysRepetition(array1,array2,array3);
		//System.out.println("unrepeated repeated: "+printSingleArray(unrepeatedArray1));
		
        /* We define the length of the new array by counting the repeated elements
			and subtracting them from the initial arrays length*/
            
      
		for(int i=0; i<unrepeatedArray1.length;i++){
			boolean stop=false;
			for(int j=i+1; j<unrepeatedArray1.length;j++){
				
		if(unrepeatedArray1[i]==unrepeatedArray1[j] && stop==false ){
				unrepeatedCounter++;
				stop=true;
			}
		}
		}
        
        //We create the new array with the calculated length
        
		int[] unrepeatedUnion= new int[unrepeatedArray1.length-unrepeatedCounter];
		//System.out.println("unrepeated real: "+printSingleArray(unrepeatedUnion));
        
        //We fill the final array
            
		for(int i=0; i<array1.length; i++){
			differentCounter=0;
			for(int j=0; j< unrepeatedUnion.length; j++){
			if(array1[i]!=unrepeatedUnion[j]){
			differentCounter++;
			}
			if(differentCounter==unrepeatedUnion.length){
			unrepeatedUnion[occupiedPos]=array1[i];
			occupiedPos++;
			}
			
			}
		
		}
		
		for(int i=0; i<array2.length; i++){
			differentCounter=0;
			for(int j=0; j< unrepeatedUnion.length; j++){
			if(array2[i]!=unrepeatedUnion[j]){
			differentCounter++;
			}
			if(differentCounter==unrepeatedUnion.length){
			unrepeatedUnion[occupiedPos]=array2[i];
			occupiedPos++;
			}
			
			}
		
		}
		
		for(int i=0; i<array3.length; i++){
			differentCounter=0;
			for(int j=0; j< unrepeatedUnion.length; j++){
			if(array3[i]!=unrepeatedUnion[j]){
			differentCounter++;
			}
			if(differentCounter==unrepeatedUnion.length){
			unrepeatedUnion[occupiedPos]=array3[i];
			occupiedPos++;
			}
			
			}
            
		
		}
		
         System.out.println("La union de los arreglos sin repetidos da el nuevo arreglo que se compone de: "+printSingleArray(unrepeatedUnion));   
            
		}
	
	
	/**Method for intercepting arrays (elements that repeat themselves in all three arrays) (exercise 16) <br>
		
		<b> pre: </b> The entered arrays must be filled with whole numbers <br>
		<b> post: </b> A new array is created with the elements that repeat themselves in all three arrays<br>
		@param array1, first array entered by the user, must be filled with whole numbers and !=null 
		@param array2, second array entered by the user, must be filled with whole numbers and !=null 
		@param array3, third array entered by the user, must be filled with whole numbers and !=null 
		*/
		public static void interceptArrays(int[] array1, int[] array2, int[] array3){
			
		//We count the elements that repeat themselves in all three arrays
			for(int i=0; i<array1.length;i++){
			for(int j=0; j<array2.length; j++){
				for (int k=0; k<array3.length;k++){
				if(array1[i]==array2[j] && array1[i]==array3[k]){
				repeatedCounter++;
				}
				
				}					
			}
		}
		
	
		//We create an array with the amount of repeated elements
		//System.out.println("counter: "+repeatedCounter);
		interceptedArray=new int[repeatedCounter];
		
		//System.out.println("Array length: "+interceptedArray.length);
		
		// We add all the repeated elements to the array
		
		
			for(int i=0; i<array1.length;i++){
			for(int j=0; j<array2.length; j++){
				for (int k=0; k<array3.length;k++){
				if(array1[i]==array2[j] && array1[i]==array3[k]){
				interceptedArray[occupiedPos2]=array1[i];
				occupiedPos2++;
				}
				}					
			
		}
			}
		
		//We count how many repeated elements are in the final array
			
		for(int i=0; i<interceptedArray.length;i++){
			boolean stop=false;
			for(int j=i+1; j<interceptedArray.length;j++){
				
		if(interceptedArray[i]==interceptedArray[j] && stop==false ){
				repeatedCounter2++;
				stop=true;
			}
		}
		}
        
        //We create the final array with the calculated lengths
        
		int[] interceptedArray2= new int[interceptedArray.length-repeatedCounter2];
		
		
		//We fill the final array
      
    
		for(int i=0; i<interceptedArray.length; i++){
			differentCounter2=0;
			for(int j=0; j< interceptedArray2.length; j++){
			if(interceptedArray[i]!=interceptedArray2[j]){
			differentCounter2++;
			}
			if(differentCounter2==interceptedArray2.length){
			interceptedArray2[occupiedPos3]=interceptedArray[i];
			occupiedPos3++;
			}
			
			}
		
		}
			
		if(repeatedCounter==0){
		System.out.println("La intercepcion de los arreglos no se puede realizar ya que no hay elementos que se repitan en los tres arreglos");
		}else{
		System.out.println("La intercepcion de los arreglos da el nuevo arreglo que se compone de:" +printSingleArray(interceptedArray2));
		}
		}
	
	/** Method to spin an array by a number selected by the user ( exercise 17) <br>
		
		<b> pre: </b> The entered arrays must be filled with whole numbers, the number to spin must be whole <br>
		<b> post: </b> A new array is created by spinning the elements of the selected array by a number selected by the user<br>
		@param array1, array selceted by the user, must be filled with whole numbers and !=null 
	
		*/
		public static void spinArray(int[] array1){
		
		//We create the new spinned array;
		spinnedArray= new int[array1.length];
		
		//We ask for the number the user wants it to be spinned
		System.out.println("Ingrese el numero de posiciones que desea girar el arreglo");
		spinNumber=sc.nextInt();
		sc.nextLine();
		spinNumber%=array1.length;
        //System.out.println(spinNumber);
		
		//We spin the array
		for(int i=0; i<array1.length;i++){
			if(i+spinNumber>=array1.length){
			finalPos=(i+spinNumber)-array1.length;
			spinnedArray[finalPos]=array1[i];
			}else{
			spinnedArray[i+spinNumber]=array1[i];
			}
		}
		System.out.println("El nuevo arreglo girado "+spinNumber+" posiciones se compone de: "+ printSingleArray(spinnedArray));
		
		}
		
	/** Method for ordering an array selected by the user from least to greatest by the bubble method (exercise 18) <br>
		
		<b> pre: </b> The entered array must be filled with whole numbers,<br>
		<b> post: </b> The array is ordered from least to greatest<br>
		@param array1, array selceted by the user, must be filled with whole numbers and !=null 
	
		*/
		public static void orderArray(int[] array1){
		int[] orderedArray= array1;
		int temp;
		
		for(int i=1; i<orderedArray.length; i++){
			for(int j= orderedArray.length-1; j>=i; j--){
			if(orderedArray[j]<orderedArray[j-1]){
			temp=orderedArray[j];
			orderedArray[j]=orderedArray[j-1];
			orderedArray[j-1]=temp;		
			}
			}
		}
		System.out.println("El nuevo arreglo ordenado de menor a mayor es: "+ printSingleArray(orderedArray));
		
		}	
	
	/** Method for a sub menu for the last nine excersises <br>
	<b> pre: </b> <br>
	<b> post: </b> Does the action selected by the user<br>
		*/
	public static void thirdProblems(){
	
	
	//The user is asked to enter arrays	
	createArrays();	
	// The user is asked what he or she wants to do
	
	do{
		System.out.println("Ingrese el numero que representa la tarea que desea realizar \n 1) Imprimir los arreglos" 
		+ " \n 2) Promedio de un arreglo \n 3) Mayor valor de un arreglo \n 4) Sumar dos arreglos \n 5) Restar dos arreglos"
		+" \n 6) Multiplicar dos arreglos \n 7) Unir los arreglos con repetidos \n 8) Unir los arreglos sin repetidos \n 9) Interceptar los arreglos"
		+" \n 10) Girar un arreglo n posiciones \n 11) Organizar un arreglo de menor a mayor \n 12) Salir");
		submenu3=sc.nextInt();
		sc.nextLine();

		switch(submenu3){

		case PRINT_ARRAYS: 
		printArrays();
		
		break;

		case ARRAY_AVERAGE: 
		averageArrays(selectArray());

		break;
		
		case ARRAY_MAX:
		maxArrays(selectArray());
		
		break;
		
		case ARRAY_ADD: 
		addArrays(selectArray(),selectArray());
		
		break;

		case ARRAY_SUBRACT: 
		subtractArrays(selectArray(),selectArray());
		
		break;

		case ARRAY_MULTIPLY: 
		multiplyArrays(selectArray(),selectArray());
		
		break;	
		
		case UNITE_ARRAYS: 
		System.out.println("La union de los arreglos con repetidos da el nuevo arreglo que se compone de:" +printSingleArray(uniteArraysRepetition(firstArray,secondArray,thirdArray)));
		
		break;
		
		case UNITE_ARRAYS_NO_REPEAT: 
		uniteArraysNoRepetition(firstArray,secondArray,thirdArray);
		
		break;
		
		case INTERCEPT_ARRAYS: 
		interceptArrays(firstArray,secondArray,thirdArray);
		
		break;
		
		case SPIN_ARRAYS:
		spinArray(selectArray());
		
		
		break;
		
		case ORDER_ARRAYS: 
		orderArray(selectArray());
		
		break;
		}
		if(submenu3>EXIT_ARRAYS){
		System.out.println("Elija una opcion valida");
		}
		}while(submenu3 != EXIT_ARRAYS);
		
		initialize();
		System.out.println("Se salio con exito");
	}
	
		
			
	/** Method that accesses the menu <br>
		
		<b> post: </b> Allows the user to navigate through the program<br>
	*/
		public static void menu(){

		
		// The user is asked what excersises he or she wants to do
		
		do{
		System.out.println("Ingrese el numero que representa la tarea que desea realizar \n 1) Ejercicios con Cadenas (Ejercicios 1-5)" +
		"\n 2) Ejercicios con Enteros Ejercicios 6-8 \n 3) Ejercicios con Arreglos (Ejercicios 9-18) \n 4) Salir");
		menu=sc.nextInt();
		sc.nextLine();

		switch(menu){

		case FIRST_PROBLEMS: 
		firstProblems();
		

		break;

		case SECOND_PROBLEMS: 
		askNumbers();
		Division(number1,number2);

		break;

		case THIRD_PROBLEMS: 
		thirdProblems();
		
		
		break;

		}
		
		if(menu>EXIT){
		System.out.println("Elija una opcion valida");
		}
		}while(menu != EXIT);
		
		System.out.println("Se salio con exito");
		}
	
	
	public static void main (String[] args){
	initialize();
	menu();
	
	}		

}



