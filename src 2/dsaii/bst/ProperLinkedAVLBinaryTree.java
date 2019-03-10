package dsaii.bst;

import dsaii.common.Position;
import jdk.internal.dynalink.linker.LinkerServices;

public class ProperLinkedAVLBinaryTree<T> extends ProperLinkedBSTBinaryTree<T> {
    public Position<T> singleLeft(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        //Simple Implementation - logic is correct in how it rotates for this case
//        this.root = b;
//        b.right = c;
//        c.parent = b;
//        c.left = null;
//        b.left = a;
//        b.parent = null;
//        a.parent = b;

        //Other Implementation - made directly from pseudo code from my notes
        b = a.right;
        a.right = b.left;

        if(b.left == c) {
            b.left.parent = a;
        }
        b.parent = a.parent;

        if(a.parent == null) {
            this.root = b;
        } else if( a == a.parent.left) {
            a.parent.left = b;
        } else {
            a.parent.right = b;
        }
        b.left = a;
        a.parent = b;

        return b;

    }

    public Position<T> singleRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        //Simple Implementation - logic is correct in how it rotates for this case
//        b.right = c;
//        b.left = a;
//        b.parent = null;
//        a.parent = b;
//        c.parent = b;
//        a.right = null;
//        this.root = b;

        //Other Implementation - made directly from pseudo code from my notes
        b = a.left;
        a.left = b.right;

        if(b.right == c) {
            b.right.parent = a;
        }
        b.parent = a.parent;

        if(a.parent == null) {
            this.root = b;
        } else if( a == a.parent.right) {
            a.parent.right = b;
        } else {
            a.parent.left = b;
        }
        b.right = a;
        a.parent = b;

        return b;
    }

    //added underscores because needed
    public Position<T> doubleLeftRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> c = toNode(_c);
        Node<T> b = toNode(_b);
        Node<T> a = toNode(_a);

        //simple Implementation - in terms of input and output, it's correct
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

        //simple Implementation - in terms of input and output, it's correct
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
