
import java.util.Scanner;

public class BlockChain implements List {

	public BlockChain() {

	}

	@Override
	public Block get(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Block h) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Transaction transaction(String sender, String receiver, int amount) {

		return (new Transaction(sender, receiver, amount));
	}

	public int getBalance(String sender) {

		return 0;
	}

	public boolean validateBlockChain() {

		return true;
	}

	public static BlockChain fromFile(String fileName) {

	}

	public static void main(String[] args) {
		// Reading block chain from file

		// Validate Block Chain
		validateBlockChain();
		// Prompting user for new transaction

	}

}
