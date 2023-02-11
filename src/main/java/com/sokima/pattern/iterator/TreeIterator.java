package com.sokima.pattern.iterator;

import com.sokima.pattern.iterator.node.Node;

import java.util.Iterator;

/**
 * Iterator Pattern.
 * Interface describes iterator to traverse a tree.
 *
 * @param <E> - the type stores in {@link Node}.
 */
public interface TreeIterator<E> extends Iterator<E> {
}
