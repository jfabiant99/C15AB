from django.db import models

class Pregunta (models.Model):
    pregunta = models.CharField(max_length=255, default='')
    fecha_pub = models.DateTimeField('date published')
    
    def __str__ (self):
        return self.pregunta


class Opcion (models.Model):
    pregunta_id = models.ForeignKey(Pregunta, on_delete=models.CASCADE)
    descripcion = models.CharField(max_length=255, default='')
    votos = models.IntegerField(default=0)
    
    def __str__(self):
        return self.descripcion
