package com.sokima.pattern.iterator;

import com.sokima.pattern.iterator.node.Node;
import com.sokima.pattern.iterator.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Implementation of {@link TreeIterator<E>}.
 * DepthFirstSearchIterator traverses {@link Tree<E>} according to Depth-First Search algorithm.
 * Implementation based on LIFO queue.
 *
 * @author Roman Denysov
 */
public class DepthFirstSearchIterator<E> implements TreeIterator<E> {
    private final Deque<Node<E>> stack;

    public DepthFirstSearchIterator(Node<E> vertex) {
        stack = new LinkedList<>();
        stack.push(vertex);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public E next() {
        Node<E> current = stack.pop();
        current.child().forEach(stack::push);
        return current.item();
    }
}
