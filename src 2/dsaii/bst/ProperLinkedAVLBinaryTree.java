package dsaii.bst;

import dsaii.common.Position;

public class ProperLinkedAVLBinaryTree<T> extends ProperLinkedBSTBinaryTree<T> {
    public Position<T> singleLeft(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        b.right = c;
        b.left = a;
        b.parent = null;
        a.parent = b;
        c.parent = b;
        c.left = null;
        this.root = b;

        return b;
    }

    public Position<T> singleRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        b.right = c;
        b.left = a;
        b.parent = null;
        a.parent = b;
        c.parent = b;
        a.right = null;
        this.root = b;

        return b;
    }

    //added underscores because needed
    public Position<T> doubleLeftRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        b.right = c;
        b.left = a;
        a.parent = b;
        c.parent = b;
        b.parent = null;
        a.right = null;
        c.left = null;
        this.root = b;

        return b;
    }

    public Position<T> doubleRightLeft(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        b.parent = null;
        a.right = null;
        c.left = null;
        a.parent = b;
        c.parent = b;
        b.right = c;
        b.left = a;
        this.root = b;

        return b;
    }
}
