import scala.io.StdIn.readLine

object App {
  def main(args: Array[String]): Unit = {
    // Задание a (i, ii, iii, iv)
    println("Задание a")
    val t_string = "Hello world!"
    println(t_string.reverse)
    println(t_string.toLowerCase)
    println(t_string.replace("!",""))
    println(t_string.replace("!","")+" and goodbye Python!")
    println()

    // Задание b
    println("Задание b")

    val year_income = 100
    val bonus = 10
    val compensation = 15
    val tax = 15
    println("Salary per month:" + (year_income*(1-tax/100)*(1+bonus/100)+compensation)/12)
    println()

    // Задание с
    println("Задание c")
    var salary_list=List(100, 150, 200, 80, 120, 75)
    val mean_salary=salary_list.sum/salary_list.size
    println("Mean salary", mean_salary)
    for (salary <- salary_list) println("Deviation for a person " +  (salary-mean_salary))
    println()

    // Задание d
    println("Задание d")
    val person_number = 2
    val person_bonus = 100
    val person_penalty = 10
    println("Original salary list ",salary_list)
    println("Updated salary list ",salary_list.updated(person_number, salary_list{person_number}+person_bonus-person_penalty))
    println()

    // Задание e
    println("Задание e")
    val new1 = 90
    val new2 = 350
    println("New worker's salary: " + new1, new2)
    salary_list=salary_list :+ new1 :+ new2
    println("List with two new workers", salary_list)
    val positions = List(300, 20, 10, 300, 30)
    var result = salary_list.sorted
    println("ordered sequence ", result)
    println()

    // задение f
    println("Задание f")
    val one_more_worker = 130
    var list2 = List[Int]()
    var begin =List[Int]()
    var end =List[Int]()
    for (num <- result) {
      if (num < one_more_worker) {
        begin=begin :+ num
      }
      else {
        end=end :+ num
      }
    }
    begin = begin :+ one_more_worker
    begin = begin ++ end
    println("List for the worker with salary " + one_more_worker + ": " + begin)
    println()


    // Задание g
    println("Задание g")
    val min_salary = 100
    val max_salary = 150
    var iterator = 0
    for (num <- begin) {
      iterator = iterator + 1
      if ((num >=min_salary) && (num <= max_salary)) {
        println("middle worker number", iterator, "middle worker salary", num)
      }
    }
    println()
    // Задание h
    println("Задание h")
    var new_salary_7 = List[Double]()
    for (elem <- begin) {
      new_salary_7 = new_salary_7 :+ elem * 1.07
    }
    println("Indexed salary", new_salary_7)

  }
}
