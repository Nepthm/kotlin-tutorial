package Collection

/*
 ? AGREGATE
 * Di kotlin dapat melakukan operasi agregate

 ? OPERATION 1
 * max() dan min() -> Mengambil nilai maksimal dan minimal
 * average() -> mengambil nilai rata-rata
 * sum() -> mengambil nilai jumlah seluruh element
 * count() -> mengambil berapa banyak element

 ? OPERATION 2
 * maxBy(selector) dan minBy(selector) -> mengambil nilai maksimal dan minimum
 * maxWith(Comparator)  dan minWith(Comparator) -> Mengambil nilai maksimal dan minimum sesuai comparator
 * sumBy(Selector) -> Mengambilk nilai jumlah seluruh element sesuai selector
 * sumByDouble(Selector) -> Sama dengan sumBy() namun menghasilkan double

 */

fun main() {
    val numbers = (1..100).toList();
    println(numbers.min())
    println(numbers.max())
    println(numbers.average())
    println(numbers.sum())
}