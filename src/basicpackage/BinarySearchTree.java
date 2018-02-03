package basicpackage;

public class BinarySearchTree {

	class BSTNode {

		private int data;
		private BSTNode left;
		private BSTNode right;

		public BSTNode(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setLeft(BSTNode left) {
			this.left = left;
		}

		public BSTNode getLeft() {
			return left;
		}

		public void setRight(BSTNode right) {
			this.right = right;
		}

		public BSTNode getRight() {
			return right;
		}
	}

	private BSTNode root;

	BSTNode getRoot() {
		return this.root;
	}

	void insertNode(int data) {
		System.out.println();
		System.out.print("Input : " + data + "      ");
		if (root == null) {
			this.root = new BSTNode(data);
		} else {
			BSTNode curr = root;

			while (curr != null) {
				System.out.print(curr.data + "-->");
				if (data < curr.data) {
					System.out.print("Left-->");
					if (curr.left == null) {
						curr.left = new BSTNode(data);
						System.out.print(data);
						break;
					} else
						curr = curr.left;
				} else {
					System.out.print("Right-->");
					if (curr.right == null) {
						curr.right = new BSTNode(data);
						System.out.print(data);
						break;
					} else
						curr = curr.right;
				}
			}
		}
	}

	public void inorderTraversal(BSTNode node) {
		if (node != null) {
			inorderTraversal(node.getLeft());
			System.out.print(node.getData() + "->");
			inorderTraversal(node.getRight());
		}
	}

	public void preorderTraversal(BSTNode node) {
		if (node != null) {
			preorderTraversal(node.getLeft());
			preorderTraversal(node.getRight());
			System.out.print(node.getData() + "->");
		}
	}

	public void postorderTraversal(BSTNode node) {
		if (node != null) {
			System.out.print(node.getData() + "->");
			postorderTraversal(node.getLeft());
			postorderTraversal(node.getRight());
		}
	}

	public int getMaxHeight(BSTNode node) {

		if (node == null) {
			return -1;
		}
		return Math.max(getMaxHeight(node.getLeft()), getMaxHeight(node.getRight())) + 1;
	}

	public int getMinValue(BSTNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node.getData();
	}

	public int getMaxValue(BSTNode node) {
		while (node.right != null) {
			node = node.right;
		}
		return node.getData();
	}

	public BSTNode deleteNode(int data, BSTNode node) {
		if (node == null)
			return null;

		if (data > node.data) {
			node.right = deleteNode(data, node.right);
		} else if (data < node.data) {
			node.left = deleteNode(data, node.left);
		} else {
			if ((node.left == null) && (node.right == null)) {
				return null;
			} else if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			} else {
				int number = getMinValue(node.right);
				node.data = number;
				node.right = deleteNode(number, node.right); 
			}
		}
		return node;
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insertNode(5);
		tree.insertNode(8);
		tree.insertNode(3);
		tree.insertNode(1);
		tree.insertNode(11);
		tree.insertNode(3);
		tree.insertNode(2);
		tree.insertNode(22);

		System.out.println();
		System.out.print("In order Traversal: ");
		tree.inorderTraversal(tree.getRoot());
		System.out.println();

		System.out.print("Pre order Traversal: ");
		tree.preorderTraversal(tree.getRoot());
		System.out.println();

		System.out.print("Post order Traversal: ");
		tree.postorderTraversal(tree.getRoot());
		System.out.println();

		System.out.println("Height of the tree : " + tree.getMaxHeight(tree.getRoot()));
		System.out.println("Min value: " + tree.getMinValue(tree.getRoot()));
		System.out.println("Max value: " + tree.getMaxValue(tree.getRoot()));

		tree.deleteNode(11, tree.getRoot());

		System.out.println();
		System.out.print("In order Traversal: ");
		tree.inorderTraversal(tree.getRoot());
		System.out.println();

	}
}
