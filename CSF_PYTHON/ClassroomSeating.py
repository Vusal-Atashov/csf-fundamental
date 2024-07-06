import random

class ClassroomSeating:
    def __init__(self, names):
        self.names = names

    def assign_seats(self):
        numbers = list(range(1, 18))
        random.shuffle(numbers)
        return list(zip(self.names, numbers))

    def display_seating(self):
        seating = self.assign_seats()
        for student, seat in seating:
            print(f"{student} - Seat {seat}")

def main():
    names = [
        "Raminə Səlimova",
        "Taha Rahimi",
        "Fəxri Babayev",
        "Murad Cəbiyev",
        "Lalə Həmidova",
        "Oruc Mövlanov",
        "Seyran Xəlilzadə",
        "Natəvan Səfərli",
        "Sənubər Abbasova",
        "Aysha Khanayeva",
        "Murad Əsgərzadə",
        "Günay İskəndərova",
        "Emil Maliyev",
        "Gülay Mustafayeva",
        "Rəfi Məmmədəliyev",
        "Arzuman Qənbərov",
        "Hacıyeva Nərmin"
    ]

    class_seating = ClassroomSeating(names)
    class_seating.display_seating()

if __name__ == "__main__":
    main()
