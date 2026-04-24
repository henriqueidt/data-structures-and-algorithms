fun lsb(n: Int): Int = n and (-n)

class FenwickTree(v: IntArray) {
    val v = v.copyOf()
    val fenwick = IntArray(v.size + 1)

    init {
        for (i in 1..v.size) {
            add(i, v[i - 1])
        }
    }

    fun query(n: Int): Int {
        var res = 0
        var i = n
        while (i > 0) {
            res += fenwick[i]
            i -= lsb(i)
        }
        return res
    }

    fun query(l: Int, r: Int): Int {
        return query(r + 1) - query(l)
    }

    fun add(i: Int, diff: Int) {
        var idx = i
        while (idx < fenwick.size) {
            fenwick[idx] += diff
            idx += lsb(idx)
        }
    }

    fun update(i: Int, value: Int) {
        add(i + 1, value - v[i])
        v[i] = value
    }
}
