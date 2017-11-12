package lesson3

import org.junit.Test

import org.junit.Assert.*

class BinaryTreeTest {
    @Test
    fun add() {
        val tree = BinaryTree<Int>()
        tree.add(10)
        tree.add(5)
        tree.add(7)
        tree.add(10)
        assertEquals(3, tree.size)
        assertTrue(tree.contains(5))
        tree.add(3)
        tree.add(1)
        tree.add(3)
        tree.add(4)
        assertEquals(6, tree.size)
        assertFalse(tree.contains(8))
        tree.add(8)
        tree.add(15)
        tree.add(15)
        tree.add(20)
        assertEquals(9, tree.size)
        assertTrue(tree.contains(8))
        assertTrue(tree.checkInvariant())
        assertEquals(1, tree.first())
        assertEquals(20, tree.last())
    }

    @Test
    fun remove() {
        val tree = BinaryTree<Int>()
        tree.add(10)
        tree.add(5)
        tree.add(7)
        tree.add(3)
        tree.add(1)
        tree.add(3)
        tree.add(4)
        tree.add(8)
        tree.add(15)
        tree.add(15)
        tree.add(20)
        tree.remove(5) // узел с двумя детьми
        tree.remove(15) // узел с одним ребенком
        tree.remove(tree.first()) // узел без детей
        tree.remove(10) // удаление корня

        assertEquals(tree.first(), 3)
        assertEquals(tree.last(), 20)


        assertEquals(tree.contains(5), false)
        assertEquals(tree.contains(15), false)
        assertEquals(tree.contains(1), false)
        assertEquals(tree.contains(10), false)
        assertEquals(tree.remove(21), false) // удаление несуществующего узла
        assertEquals(true, tree.checkInvariant())
    }

    @Test
    fun addKotlin() {
        val tree = KtBinaryTree<Int>()
        tree.add(10)
        tree.add(5)
        tree.add(7)
        tree.add(10)
        assertEquals(3, tree.size)
        assertTrue(tree.contains(5))
        tree.add(3)
        tree.add(1)
        tree.add(3)
        tree.add(4)
        assertEquals(6, tree.size)
        assertFalse(tree.contains(8))
        tree.add(8)
        tree.add(15)
        tree.add(15)
        tree.add(20)
        assertEquals(9, tree.size)
        assertTrue(tree.contains(8))
        assertTrue(tree.checkInvariant())
        assertEquals(1, tree.first())
        assertEquals(20, tree.last())
    }
}