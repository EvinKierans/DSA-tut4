package dsaii.bst;

import dsaii.common.Position;
import jdk.internal.dynalink.linker.LinkerServices;

public class ProperLinkedAVLBinaryTree<T> extends ProperLinkedBSTBinaryTree<T> {
    public Position<T> singleLeft(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> z = toNode(_c);
        Node<T> y = toNode(_b);
        Node<T> x = toNode(_a);

//        New new implementation
        y = x.right;
        x.right = y.left;

        if(y.left == z) {
            y.left.parent = x;
        }
        y.parent = x.parent;

        if(x.parent == null) {
            this.root = y;
        } else if( x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;

//        Thomas Implementation
//        if(c == root) {
//            root = b;
//            Node<T> tmp = b.right;
//
//            b.right = c;
//            c.parent = b;
//
//            c.left = tmp;
//        } else {
//            if(c.parent.left.equals(c)) {
//                c.parent.left = b;
//            } else {
//                c.parent.right = b;
//            }
//
//            Node<T> tmp = b.right;
//
//            b.right = c;
//            c.right =b;
//
//            c.left = tmp;
//        }

//        Previous Implementation
//        this.root = b;
//        b.right = c;
//        c.parent = b;
//        c.left = null;
//        b.left = a;
//        b.parent = null;
//        a.parent = b;

        return y;
    }

    public Position<T> singleRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> z = toNode(_c);
        Node<T> y = toNode(_b);
        Node<T> x = toNode(_a);

//        New new Implementation
        y = x.left;
        x.left = y.right;

        if(y.right == z) {
            y.right.parent = x;
        }
        y.parent = x.parent;

        if(x.parent == null) {
            this.root = y;
        } else if( x == x.parent.right) {
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;

//        Previous Implementation
//        b.right = c;
//        b.left = a;
//        b.parent = null;
//        a.parent = b;
//        c.parent = b;
//        a.right = null;
//        this.root = b;

        return y;
    }

    //added underscores because needed
    public Position<T> doubleLeftRight(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> z = toNode(_c);
        Node<T> y = toNode(_b);
        Node<T> x = toNode(_a);

//        New new Implementation

//        Previous Implementation
//        b.right = c;
//        b.left = a;
//        a.parent = b;
//        c.parent = b;
//        b.parent = null;
//        a.right = null;
//        c.left = null;
//        this.root = b;

        return y;
    }

    public Position<T> doubleRightLeft(Position<T> _a, Position<T> _b, Position<T> _c) {
        Node<T> z = toNode(_c);
        Node<T> y = toNode(_b);
        Node<T> x = toNode(_a);

//        New new Implementation

//        Previous Implementation
//        b.parent = null;
//        a.right = null;
//        c.left = null;
//        a.parent = b;
//        c.parent = b;
//        b.right = c;
//        b.left = a;
//        this.root = b;

        return y;
    }
}
