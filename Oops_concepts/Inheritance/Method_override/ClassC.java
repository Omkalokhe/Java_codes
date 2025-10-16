package Method_override;

public class ClassC extends ClassB {

	@Override
	void m3() {
		System.out.println("Override method m3 in classC");
	}

	@Override
	void m4() {
		System.out.println("Override method m4 in classC");
	}

	@Override
	void m5() {
		System.out.println("Override method m5 in classC");
	}

	void m6() {
		System.out.println("ClassC m6 Method");
	}



	void m7() {
		System.out.println("ClassC m7 Method");
	}

}
