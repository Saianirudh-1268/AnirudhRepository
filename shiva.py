from sketchpy import canvas
from turtle import Screen
s=Screen()
s.bgcolor("Black")
ab=canvas.sketch_from_jpg("shiva.jpg",scale=45)
ab.draw()
