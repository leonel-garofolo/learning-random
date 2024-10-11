class Circle(object):
    # this is the constructor class
    def __init__(self, radius, color):
        self.radius = radius
        self.color = color

    def add_radius(self, r):
        self.radius = self.radius + r
        return self.radius

    def draw_circle(self):
        pass


class Rectangle(object):

    def __init__(self, color, height, width):
        self.color = color
        self.height = height
        self.widht = width


RedCircle = Circle(10, 'Red')
RedRectangle = Rectangle('Red', 10, 10)
print("RedCircle", RedCircle)
print("RedRectangle", RedRectangle)
print(dir(Circle))
