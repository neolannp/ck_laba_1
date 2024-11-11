class Student:
    def __init__(self, name, group, course, grades):
        self.name = name
        self.group = group
        self.course = course
        self.grades = grades

    def average_grade(self):
        return sum(self.grades) / len(self.grades)

students = [
    Student("Антон", "Б-213", 1, [4, 5, 3, 2, 4, 5, 3]),
    Student("Мария", "Б-214", 2, [5, 4, 4, 5, 5, 3, 4]),
    Student("Сергей", "Б-215", 3, [3, 2, 2, 4, 3, 4, 5]),
    Student("Елена", "Б-216", 4, [5, 5, 5, 4, 5, 4, 5]),
    Student("Дмитрий", "Б-213", 1, [3, 3, 4, 2, 3, 4, 3]),
    Student("Александра", "Б-214", 2, [4, 5, 4, 4, 4, 3, 5]),
    Student("Иван", "Б-215", 3, [2, 2, 3, 3, 4, 2, 3]),
    Student("Ольга", "Б-216", 4, [5, 4, 5, 5, 5, 5, 4]),
    Student("Никита", "Б-213", 1, [1, 2, 1, 2, 1, 2, 1]),
    Student("Татьяна", "Б-214", 2, [4, 4, 5, 4, 4, 4, 5]),
    Student("Максим", "Б-215", 3, [3, 3, 3, 3, 3, 3, 3]),
    Student("Анна", "Б-216", 4, [5, 5, 5, 5, 4, 5, 5]),
    Student("Константин", "Б-213", 1, [2, 3, 2, 4, 3, 2, 3]),
    Student("Светлана", "Б-214", 2, [5, 5, 5, 5, 5, 5, 5]),
    Student("Роман", "Б-215", 3, [2, 4, 3, 3, 4, 2, 3]),
    Student("Ксения", "Б-216", 4, [4, 3, 4, 4, 5, 4, 4])
]


def select_students(students):
    for student in students:
        if student.average_grade() < 3:
            students.remove(student)
        else:
            student.course += 1


def print_students(students, course):
    for student in students:
        if student.course == course:
            print(student.name)


select_students(students)
while True:
        try:
            course_number = int(input("Введите номер курса(1-4): "))
            if 1 <= course_number <= 4:
                print_students(students, course_number)
                break
            else:
                print("Пожалуйста, введите число от 1 до 4")
        except ValueError:
            print("Пожалуйста, введите число от 1 до 4")
