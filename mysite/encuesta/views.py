from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader
from .models import Pregunta

##Importando las librerias a utilizar
from rest_framework.renderers import JSONRenderer
from .serializers import PreguntaSerializer

def index(request):
    latest_question_list = Pregunta.objects.order_by('-fecha_pub')[:5]
    template = loader.get_template('polls/index.html')
    context = {
        'latest_question_list': latest_question_list,
    }
    return HttpResponse(template.render(context, request))

def detalle(request, pregunta_id):
    return HttpResponse("Estas viendo la pregunta %s." % pregunta_id)

def resultados(request, pregunta_id):
    response = "Estas viendo los resultado de la pregunta %s."
    return HttpResponse(response % pregunta_id)

def votar(request, pregunta_id):
    return HttpResponse("Estas votando por la pregunta %s." % pregunta_id)
def demo(request, v1, v2):
    return HttpResponse("v1: %(val1)s ; v2:%(val2)s" % {"val1":v1,"val2":v2})

def apiPreguntas (request):
    lista = Pregunta.objects.all()
    serializer = PreguntaSerializer(lista, many=True)
    return JSONResponse(serializer.data)