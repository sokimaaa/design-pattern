package com.sokima.pattern.iterator.node;

import java.util.List;

/**
 * Represent a way to interact with node.
 *
 * @param <E> - the type stores in the Node
 * @author Roman Denysov
 */
public interface Node<E> {

    List<Node<E>> child();

    E item();

    // some impl
}
