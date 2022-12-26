package test.generic;

class A {
}

class B extends A {
}

class C extends B {
}

class D extends C {
}

class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}  
	private void sysout() {
		// TODO Auto-generated method stub

	}
  
}

public class Main {

	static void method1(Goods<A> g) {
	}

	static void method2(Goods<?> g) {
	}

	static void method3(Goods<? extends B> g) {
	}

	static void method4(Goods<? super B> g) {
	}

	public static void main(String[] args) {

		method1(new Goods<A>());
//		method1(new Goods<B>());
//		method1(new Goods<C>());
//		method1(new Goods<D>());

		method2(new Goods<A>());
		method2(new Goods<B>());
		method2(new Goods<C>());
		method2(new Goods<D>());
		method2(new Goods<String>());

//		method3(new Goods<A>());
		method3(new Goods<B>());
		method3(new Goods<C>());
		method3(new Goods<D>());
//		method3(new Goods<String>());

		System.out.println("dd");
		
		System.out.println("깃허브에 반영할 내용");
	}
}
