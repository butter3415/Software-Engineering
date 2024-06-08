class TreeNode:
    def __init__(self):
        self.left = None
        self.data = None
        self.right = None


def post_order(node):
    if node is None:
        return
    post_order(node.left)
    post_order(node.right)
    print(node.data, end=' ')


def in_order(node):
    if node is None:
        return
    in_order(node.left)
    print(node.data, end=' ')
    in_order(node.right)



data_array = ["화사", "솔라", "문별", "휘인", "쯔위", "선미"]

if __name__ == "__main__":
    node = TreeNode()
    node.data = data_array[0]
    root = node

    for name in data_array[1:]:
        node = TreeNode()
        node.data = name
        current = root
        while True:
            if name < current.data:
                if current.left is None:
                    current.left = node
                    break
                current = current.left
            else:
                if current.right is None:
                    current.right = node
                    break
                current = current.right

    post_order(root)
    print()
    in_order(root)





# from abc import ABC, abstractmethod
#
# # component interface
# class Graphic(ABC):
#     @abstractmethod
#     def draw(self):
#         pass
#
#     @abstractmethod
#     def add(self, graphic):
#         pass
#
#     @abstractmethod
#     def remove(self, graphic):
#         pass
#
#
# # leaf
# class Dot(Graphic):
#     def __init__(self, x, y):
#         self.x = x
#         self.y = y
#
#     def draw(self):
#         print(f"점의 좌표 : ({self.x}, {self.y})")
#
#     def add(self, graphic):
#         pass
#
#     def remove(self, graphic):
#         pass
#
# # leaf
# class Circle(Graphic):
#     def __init__(self, x, y, radius):
#         self.x = x
#         self.y = y
#         self.radius = radius
#
#     def draw(self):
#         print(f"원의 좌표 : ({self.x}, {self.y}, 반지름 : {self.radius})")
#
#     def add(self, graphic):
#         pass
#
#     def remove(self, graphic):
#         pass
#
#
# # composite
# class CompositeGraphic(Graphic):
#     def __init__(self):
#         self.graphics = list()
#
#     def draw(self):
#         for graphic in self.graphics:
#             graphic.draw()
#
#     def add(self, graphic):
#         self.graphics.append(graphic)
#
#     def remove(self, graphic):
#         self.graphics.remove(graphic)
#
#

# if __name__ == "__main__":
#     d1 = Dot(100, 200)
#     d2 = Dot(100, 350)
#     c1 = Circle(150, 50, 7)
#
#     composite1 = CompositeGraphic()
#     composite1.add(d1)
#     composite1.add(d2)
#     composite1.add(c1)
#
#     composite1.draw()
#     composite1.remove(d2)
#     composite1.draw()
#