package housestandards;

public class estimate {
public static int func(int opt,int sq,int a) {
	if(opt == 3 && a == 1)
		return calculate.func(2500,sq);
	else if(opt == 3)
		return calculate.func(1800,sq);
	else if(opt == 2)
		return calculate.func(1500,sq);
	else if(opt == 1)
		return calculate.func(1200,sq);
	return 0;
}

}
