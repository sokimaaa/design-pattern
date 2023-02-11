package com.sokima.pattern.iterator.tree;

import com.sokima.pattern.iterator.node.Node;

/**
 * Concrete implementation of Tree Collection.
 * Implementation of the Auto Balanced Tree.
 *
 * @param <E> - the type stores in {@link Node}
 * @author Roman Denysov
 */
public class AutoBalancedTree<E> extends AbstractTree<E> implements Tree<E> {
    public AutoBalancedTree(Node<E> vertex) {
        super(vertex);
    }

    // some impl
}
