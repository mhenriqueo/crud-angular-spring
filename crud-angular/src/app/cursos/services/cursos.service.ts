import { Curso } from './../models/curso';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { delay, first, tap } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CursosService {

  private readonly API = '/assets/cursos.json';

  constructor(private httpClient: HttpClient) { }

  findAll(){
    return this.httpClient.get<Curso[]>(this.API)
    .pipe(
      first(),
      delay(2000),
      tap(cursos => console.log(cursos))
    );
  }
}
