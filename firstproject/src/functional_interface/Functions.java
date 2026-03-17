package functional_interface;

public interface Functions<Input1, Input2, Output> {
	Output apply(Input1 i1, Input2 i2);
}
