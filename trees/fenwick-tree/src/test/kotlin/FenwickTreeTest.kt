import kotlin.test.Test
import kotlin.test.assertEquals

class FenwickTreeTest {

    @Test
    fun `prefix sum query`() {
        val tree = FenwickTree(intArrayOf(4, 8, 5, 2, 6, 1, 0, 8, 1, 5))

        assertEquals(4, tree.query(1))
        assertEquals(12, tree.query(2))
        assertEquals(17, tree.query(3))
        assertEquals(19, tree.query(4))
        assertEquals(25, tree.query(5))
        assertEquals(26, tree.query(6))
        assertEquals(26, tree.query(7))
        assertEquals(34, tree.query(8))
        assertEquals(35, tree.query(9))
        assertEquals(40, tree.query(10))
    }

    @Test
    fun `range query`() {
        val tree = FenwickTree(intArrayOf(4, 8, 5, 2, 6, 1, 0, 8, 1, 5))

        assertEquals(15, tree.query(1, 3))
        assertEquals(26, tree.query(0, 5))
        assertEquals(5, tree.query(2, 2))
    }

    @Test
    fun `update value`() {
        val tree = FenwickTree(intArrayOf(4, 8, 5, 2, 6, 1, 0, 8, 1, 5))

        assertEquals(8, tree.query(1, 1))
        tree.update(1, 7)
        assertEquals(7, tree.query(1, 1))
    }
}
