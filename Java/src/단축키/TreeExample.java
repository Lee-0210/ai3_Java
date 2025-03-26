package 단축키;
import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    List<TreeNode> children;

    public TreeNode(int value) {
    	System.out.println("객체 생성");
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public int getChildCount() {
        return children.size();
    }
}

public class TreeExample {
    public static void main(String[] args) {
        // 트리 노드 생성
        TreeNode root = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        TreeNode child2 = new TreeNode(3);
        TreeNode child3 = new TreeNode(4);
        TreeNode child4 = new TreeNode(5);

        // 자식 노드 추가
        root.addChild(child1);
        root.addChild(child2);
        child2.addChild(child3);
        child2.addChild(child4);

        // 1번 노드의 자식 노드 개수 확인
        System.out.println("1번 노드의 자식 노드 개수: " + root.getChildCount());

        // 3번 노드의 자식 노드 개수 확인
        System.out.println("3번 노드의 자식 노드 개수: " + child2.getChildCount());
    }
}
