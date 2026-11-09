import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// LeetCode 297: Serialize and Deserialize Binary Tree
public class SerializeAndDeserializeBinaryTree {

    public String serialize(TreeNode root) {
        if (root == null) return "null,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(nodes);
    }

    private TreeNode helper(Queue<String> nodes) {
        String val = nodes.poll();
        if (val.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper(nodes);
        node.right = helper(nodes);

        return node;
    }
}
