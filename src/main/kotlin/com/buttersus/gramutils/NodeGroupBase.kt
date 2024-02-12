package com.buttersus.gramutils

/**
 * A node that represents static list of nodes.
 * - Indexing starts from 1.
 * - It's not a failure even if size is 0.
 *
 * @param SC Super type. _(NodeBase<SC>)_
 * @param S Self type.
 * @return Group of nodes
 */
interface NodeGroupBase<SC: NodeBase<SC>, S: NodeGroupBase<SC, S>> {
    /**
     * Creates a new group of nodes from the list of nodes.
     * It's used by the `select` method, so you must override it.
     */
    fun createGroup(nodes: List<Opt<SC>>): S

    /**
     * Shortcut to get only needed nodes from the group.
     * _(returns only 20 components at most)_
     *
     * Usage:
     * ```
     * val (𝚗₁, 𝚗₃) = Group(𝚗₁, 𝚗₂, 𝚗₃).select(1, 3)
     * ```
     *
     * @param 𝚒s Indices of needed nodes _(starts from 1)_
     * @return List of needed nodes
     */
    fun select(vararg `𝚒s`: Int): S = createGroup(`𝚒s`.map { item(it) })

    /**
     * Shortcut to get only needed node from the group.
     *
     * Usage:
     * ```
     * val 𝚗₁ = Group(𝚗₁, 𝚗₂, 𝚗₃).item(1)
     * ```
     *
     * @param 𝚒 Index of needed node _(starts from 1)_
     * @return Needed node
     */
    fun item(`𝚒`: Int): Opt<SC>

    // Destructuring
    operator fun component1(): Opt<SC> = item(1)
    operator fun component2(): Opt<SC> = item(2)
    operator fun component3(): Opt<SC> = item(3)
    operator fun component4(): Opt<SC> = item(4)
    operator fun component5(): Opt<SC> = item(5)
    operator fun component6(): Opt<SC> = item(6)
    operator fun component7(): Opt<SC> = item(7)
    operator fun component8(): Opt<SC> = item(8)
    operator fun component9(): Opt<SC> = item(9)
    operator fun component10(): Opt<SC> = item(10)
    operator fun component11(): Opt<SC> = item(11)
    operator fun component12(): Opt<SC> = item(12)
    operator fun component13(): Opt<SC> = item(13)
    operator fun component14(): Opt<SC> = item(14)
    operator fun component15(): Opt<SC> = item(15)
    operator fun component16(): Opt<SC> = item(16)
    operator fun component17(): Opt<SC> = item(17)
    operator fun component18(): Opt<SC> = item(18)
    operator fun component19(): Opt<SC> = item(19)
    operator fun component20(): Opt<SC> = item(20)
}