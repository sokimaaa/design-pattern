package com.sokima.pattern.iterator.tree;

import com.sokima.pattern.iterator.node.Node;

/**
 * Concrete implementation of Tree Collection.
 * Represent Binary tree, so means, each node has only two child.
 *
 * @param <E> - the type stores in {@link Node}
 * @author Roman Denysov
 */
public class BinaryTree<E> extends AbstractTree<E> implements Tree<E> {
    public BinaryTree(Node<E> vertex) {
        super(vertex);
    }

    // some impl
}
