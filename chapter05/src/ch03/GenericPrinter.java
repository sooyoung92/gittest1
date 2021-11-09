package ch03;

public class GenericPrinter<T> {

	// T ��� ��ü ���ڸ� ����Ѵ�. E - element, K - key, V - value ���
	// �ڷ��� �Ű����� (type parameter)

	private T material;

	public T getmaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	// toString �������̵�
	@Override
	public String toString() {
		return material.toString();
	}

}
