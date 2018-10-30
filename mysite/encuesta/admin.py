from django.contrib import admin
from .models import Pregunta
from .models import Opcion

admin.site.register(Pregunta)
admin.site.register(Opcion)


